deve-se pensar em regras para o sistema academico fazer sentido
```mermaid
    classDiagram
        
        
        class Funcionario{
            - salario : double
            - efetivo : bool
            }
        
        class Pessoa{
            - id : int
            - CPF : int
        }
        
        class Professor{
            - areaConhecimento : ENUM
            - grauInstrucao : ENUM
        }
        
        
        Pessoa <| -- Funcionario
        Funcionario <| -- Professor 
```