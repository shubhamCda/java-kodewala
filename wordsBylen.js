const obj = [
	"Bengaluru",
	"Mumbai",
	"Hyderabad",
	"Ahmedabad",
	"Delhi",
	"Mangalore",
];

const solution = obj.reduce((acc, val) => {
	if (!acc[val.length]) {
		acc[val.length] = val;
  } else {
    acc[val.length] = val
  }
  return acc;
}, {});


console.log(solution);
