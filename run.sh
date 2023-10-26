#!/bin/bash
echo "Starting Expt"
rm -r out


# -----------------------------------------------------Compiled run----------------------------------------------------
    echo "-----------------------------------Compiled Run------------------------------------" >> out/out.log
    for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
    do
        $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:+EnableArrayFlattening -Xjit:count=1,disableAsyncCompilation,initialoptlevel=hot -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> primitiveInstanceComp$i.log 2>&1
    done
#
    echo "-----------------------------------------------------------------------" >> out/out.log
    echo "Completed Usecase - Primitive"
    echo "Completed Usecase - Primitive" >> out/out.log
#
    echo "-----------------------------------------------------------------------" >> out/out.log
    for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
    do
        $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=0 -Xjit:count=1,disableAsyncCompilation,initialoptlevel=hot -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> nonprimitiveInstanceComp$i.log 2>&1
    done
    echo "-----------------------------------------------------------------------" >> out/out.log
    echo "Completed Usecase - Non-Primitive"
    echo "Completed Usecase - Non-Primitive" >> out/out.log
#
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
#     do
#         $DEV_JDK/java -XX:+UseStaticResults -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:+EnableArrayFlattening -Xjit:count=1,disableAsyncCompilation,initialoptlevel=hot -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> primitiveCompWithStaticRes$i.log 2>&1
#
#     done
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Primitive with static results"
#     echo "Completed Usecase - Primitive with static results" >> out/out.log

    echo "Finished Compiled Expt"
echo "Finished Compiled Expt" >> out/out.log
echo "-----------------------------------Compiled Run End------------------------------------" >> out/out.log

# -----------------------------------------------------Interpreter run----------------------------------------------------
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
#     do
#         $DEV_JDK/java -Xint -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:+EnableArrayFlattening -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> primitiveInstanceInt.log 2>&1
#
#     done
#
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Primitive"
#     echo "Completed Usecase - Primitive" >> out/out.log
#
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
#     do
#         $DEV_JDK/java -Xint -Xverify:none -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> nonprimitiveInstanceInt.log 2>&1
#     done
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Non-Primitive"
#     echo "Completed Usecase - Non-Primitive" >> out/out.log
#
# echo "Finished Transaction-Analysis"
# echo "Finished Transaction-Analysis" >> out/out.log
#
#-----------------------------------------------------Normal run----------------------------------------------------
#     echo "-------------------------------Normal Run----------------------------------------" >> out/out.log
#     for i in 1 2 3  4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
#     do
#         $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:+EnableArrayFlattening -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> primitiveInstanceNormal$i.log 2>&1
#     done
#
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Primitive"
#     echo "Completed Usecase - Primitive" >> out/out.log
#
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
#     do
#         $DEV_JDK/java -Xverify:none -XX:ValueTypeFlatteningThreshold=0 -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> nonprimitiveInstanceNormal$i.log 2>&1
#     done
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Non-Primitive"
#     echo "Completed Usecase - Non-Primitive" >> out/out.log

#     echo "-----------------------------------------------------------------------" >> out/out.log
#     for i in 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
#     do
#         $DEV_JDK/java -Xshareclasses:none -XX:+UseStaticResults -Xverify:none -XX:ValueTypeFlatteningThreshold=100000 -XX:+EnableArrayFlattening -cp size-expt-1.0.jar in.ac.iitmandi.compl.Main >> primitiveNormalWithStaticRes$i.log 2>&1
#
#     done
#     echo "-----------------------------------------------------------------------" >> out/out.log
#     echo "Completed Usecase - Primitive with static results"
#     echo "Completed Usecase - Primitive with static results" >> out/out.log


#
# echo "Finished Raytracer Normal"
# echo "Finished Raytracer Normal" >> out/out.log

echo "-----------------------------------Normal Run End------------------------------------" >> out/out.log
