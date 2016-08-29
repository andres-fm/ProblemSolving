import Control.Applicative
import Control.Monad
import System.IO

beautiful :: String -> Int
beautiful _ = 0
beautiful (x:y:z:xs) = if [x, y, z] == ['0', '1', '0'] then 1 + (beautiful (xs)) else 0 + (beautiful (y:z:xs))

main :: IO ()
main = do
    _ <- getLine
    b <- getLine
    print (beautiful b)         
