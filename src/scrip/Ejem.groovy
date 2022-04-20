package scrip

print "What is your name? "
def name = System.in.newReader().readLine()
println "Your name is " + name

def y = 5
def x = (y > 1) ? "funciona" : "falla"
assert x == "funciona"

int [] array = [0,2,3,4]
for(i in array)
    println i

def empleado = ["Nelson" : 25, "Juan" : 22, "Dani" : 27];

for(emp in empleado) {
    println(emp);
}

int Contador = 1
while(Contador<5) {
    println(Contador);
    Contador++;
}

for(int i in array) {
    println(i*10);
    if(i == 3)
        break;
}
def metodo1(def r){
    println("primer metodo")
    println("el numero es "+r)
}
metodo1([1,3,4])

static int sum(int a,int b = 5) {
    int c = a+b;
    return c;
}
sum(8,8) //esto devolveria 16
println(sum(5))

def diccionario = ['nombre' :"Nelson", "Lenguaje" : "Groovy"]
println(diccionario.get("nombre"))
println(diccionario.size())
println(diccionario.values())

println('Groovy' ==~ 'Groovy')
if ('Groovy' =~ 'oo')
    println("dio")
else {
    println("no dio")
}
println('Groovy' ==~ '∧G')

def regex = ~'Groovy'
println(regex)