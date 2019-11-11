let meetups = [
    {name:'Javasricpt', isActive:true, members:700},
    {name:'Angular', isActive:true, members:900},
    {name:'Node', isActive:false, members:600},
    {name:'React', isActive:true, members:500}
];
let sumFPChain = meetups.filter((m)=>{
    return m.isActive;
})
.map((m)=>{
    return m.members- (0.1*m.members);
})
.reduce((acc, m)=>{
    rreturn acc + m;
},0);
console.log(sumFPChain); //output will be 1890