package clasees

saludo = "Hola"
println("${saludo} Mundo!")

def hola(nombre){
    println "Hola $nombre"
}
hola("Fran")

//assert 1==2 : "Desde cuando 1 es igual a 2"



public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}


miLista = ['a','b','c','d','e','f']
assert miLista[0..2] == ['a','b','c']//Acceso con Rangos
assert miLista[0,2,4] == ['a','c','e']//Acceso con colección de índices
//Modificar elementos
miLista[0..2] = ['x','y','z']
assert miLista == ['x','y','z','d','e','f']
//Eliminar elementos de la lista
miLista[3..5] = []
assert miLista == ['x','y','z']
//Añadir elementos a la lista
miLista[1..1] = ['y','1','2']
assert miLista == ['x','y','1','2','z']
miLista = []
//Añado objetos a la lista con el operador +
miLista += 'a'
assert miLista == ['a']
//Añado colecciones a la lista con el operador +
miLista += ['b','c']
assert miLista == ['a','b','c']
miLista = []
miLista << 'a' << 'b'
assert miLista == ['a','b']
assert miLista - ['b'] == ['a']
assert miLista * 2 == ['a','b','a','b']



