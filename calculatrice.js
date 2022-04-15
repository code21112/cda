const calculatrice = document.getElementById("calc");

// Event listener au click sur le button "Montrer"
const btnMontrer = document.getElementById("btn_montrer");

btnMontrer.addEventListener("click", () => {
  console.log("click sur btn montrer");
  calculatrice.classList.toggle("calc");
  calculatrice.classList.toggle("invisible");
});

// Event listener au hover du premier nombre
const firstTermInput = document.getElementById("firstTerm");

firstTermInput.addEventListener("mouseover", () => {
  document.querySelector("#text_under_form").innerHTML = "Saisir un chiffre";
});

firstTermInput.addEventListener("mouseout", () => {
  document.querySelector("#text_under_form").innerHTML = "";
});

// Event listener au hover des operations
const operationInput = document.getElementById("operation");

operationInput.addEventListener("mouseover", () => {
  console.log("hover de l'input operations");
  document.querySelector("#text_under_form").innerHTML =
    "Sélectionnez un opérateur: +, -, * ou /";
});

operationInput.addEventListener("mouseout", () => {
  document.querySelector("#text_under_form").innerHTML = "";
});

function calculate() {
  let result;
  var firstTerm = parseInt(document.getElementById("firstTerm").value);
  var secondTerm = parseInt(document.getElementById("secondTerm").value);

  var operation = document.getElementById("operation").value;

  switch (operation) {
    case "+":
      result = firstTerm + secondTerm;
      break;
    case "-":
      result = firstTerm - secondTerm;
      break;
    case "*":
      result = firstTerm * secondTerm;
      break;
    case "/":
      result = (firstTerm / secondTerm).toFixed(2);
      break;
    default:
      break;
  }
  alert(
    `Le résultat de l'opération ${firstTerm} ${operation} ${secondTerm} est ${result}.`
  );
}
