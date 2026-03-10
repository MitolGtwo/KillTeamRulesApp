console.log("Kill Team PWA started")

// register service worker

if ("serviceWorker" in navigator) {

navigator.serviceWorker.register("service-worker.js")
.then(() => console.log("Service Worker registered"))

}