import Control.Applicative
import Control.Monad
import System.IO

jumping :: [Int] -> Int
jumping [] = 0
jumping [x] = 1
jumping (x:y:ys) = if y == 1 then 1 + jumping (y:ys) else 1 + jumping (ys)

main :: IO ()
main = do
    _ <- getLine
    c_temp <- getLine
    let c = tail (map read $ words c_temp :: [Int])
    print (jumping c)
