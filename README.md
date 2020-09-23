# SpringCrud - Mis recordatorios
# Permitir consultas.
@CrossOrigin(origins = "http://localhost:4200")
# Creacion de consultas personalizadas(Repositorio)
@Query("Select l from Laptop l where l.status = ?1")  
List<Laptop> findLaptopByStatus(boolean status);

