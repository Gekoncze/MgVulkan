#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkImportFenceFdKHR_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pImportFenceFdInfo, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkImportFenceFdKHR f = (PFN_vkImportFenceFdKHR)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkImportFenceFdInfoKHR*)jniLongToPointer(pImportFenceFdInfo))
    );
}


jint Java_cz_mg_vulkan_PFNvkImportFenceFdKHR_callSimplifiedNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pImportFenceFdInfo){
    (void)env;
    (void)jc;
    PFN_vkImportFenceFdKHR f = (PFN_vkImportFenceFdKHR)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkImportFenceFdInfoKHR*)jniLongToPointer(pImportFenceFdInfo))
    );
}

