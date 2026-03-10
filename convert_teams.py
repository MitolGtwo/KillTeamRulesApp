import re
import json
from pathlib import Path

KOTLIN_FILE = "app/src/main/java/com/example/killteamruleset/ui/data/TeamRepository.kt"
OUTPUT_DIR = "web/data/teams"

Path(OUTPUT_DIR).mkdir(parents=True, exist_ok=True)

with open(KOTLIN_FILE, "r", encoding="utf8") as f:
    text = f.read()

team_blocks = re.findall(r'Team\((.*?)\)', text, re.S)

teams = []

for block in team_blocks:

    def find_string(field):
        m = re.search(rf'{field}\s*=\s*"([^"]+)"', block)
        return m.group(1) if m else None

    def find_drawable(field):
        m = re.search(rf'{field}\s*=\s*R\.drawable\.([a-zA-Z0-9_]+)', block)
        if m:
            return f"images/{m.group(1)}.png"
        return None

    def find_enum(field):
        m = re.search(rf'{field}\s*=\s*\w+\.([A-Z_]+)', block)
        return m.group(1) if m else None

    archetypes = re.findall(r'Archetypes\.([A-Z_]+)', block)

    team = {
        "id": find_string("id"),
        "name": find_string("name"),
        "alliance": find_enum("alliance"),
        "type": find_enum("type"),
        "difficulty": find_string("difficulty"),
        "archetypes": archetypes,
        "factionRulesBackgroundRes": find_drawable("factionRulesBackgroundRes"),
        "backgroundRes": find_drawable("backgroundRes"),
        "assemblyPdfAsset": find_string("assemblyPdfAsset"),
        "iconRes": find_drawable("iconRes"),
        "quote": find_string("quote")
    }

    teams.append(team)

# split by alliance
alliances = {"IMPERIUM": [], "CHAOS": [], "XENOS": []}

for team in teams:
    alliances[team["alliance"]].append(team)

for alliance, data in alliances.items():
    path = Path(OUTPUT_DIR) / f"{alliance.lower()}.json"
    with open(path, "w", encoding="utf8") as f:
        json.dump(data, f, indent=2)

print("Conversion complete.")