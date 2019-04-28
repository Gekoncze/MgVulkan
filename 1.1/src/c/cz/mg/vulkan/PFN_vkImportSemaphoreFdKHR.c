#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkImportSemaphoreFdKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pImportSemaphoreFdInfo){
    (void)env;
    (void)jc;
    PFN_vkImportSemaphoreFdKHR f = (PFN_vkImportSemaphoreFdKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkImportSemaphoreFdInfoKHR*)jniLongToPointer(pImportSemaphoreFdInfo))
    );
}

