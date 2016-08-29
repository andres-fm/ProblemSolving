import Control.Applicative
import Control.Monad
import System.IO

changed :: String -> Int
changed [] = 0
changed (x:y:z:zs) = check [x] + check [x,y] + check [z] + changed zs

check :: String -> Int
check [x] = if x == 'S' then 0 else 1
check [x,y] = if y == 'O' then 0 else 1

main :: IO ()
main = do
    s <- getLine      
    print(changed s)
