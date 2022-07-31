// This file can be replaced during build by using the `fileReplacements` array.
// `ng build` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
  API_URL: 'http://localhost:8090/api',
  firebaseConfig:{
    apiKey: "AIzaSyDTNZgkJZ61CslqcRrHCU0LCmWXtgffMvM",
    authDomain: "client-mi-porfolio.firebaseapp.com",
    projectId: "client-mi-porfolio",
    storageBucket: "client-mi-porfolio.appspot.com",
    messagingSenderId: "293833838627",
    appId: "1:293833838627:web:cbb0978ab616595e016196",
    measurementId: "G-Q9J2FS4715"
  }
};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/plugins/zone-error';  // Included with Angular CLI.
