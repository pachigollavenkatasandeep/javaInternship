
const readlineSync = require('readline-sync');
let n = readlineSync.question("Enter size: ");
let arr = [];
for (let i = 0; i < n; i++) {
    arr[i] =  readlineSync.question(`Enter value ${i + 1}:`);
}
for(let i=0;i<n;i++){
    if(arr[i]%2==0){
        console.log(arr[i]);
    }
}
  