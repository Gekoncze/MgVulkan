#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkReallocationFunction_call(JNIEnv* env, jclass jc, jlong address, jlong pUserData, jlong pOriginal, jlong size, jlong alignment, jlong allocationScope){
    (void)env;
    (void)jc;
    PFN_vkReallocationFunction f = (PFN_vkReallocationFunction)jniLongToFunctionPointer(address);
    f(
        ((void*)jniLongToPointer(pUserData)),
        ((void*)jniLongToPointer(pOriginal)),
        *((size_t*)jniLongToPointer(size)),
        *((size_t*)jniLongToPointer(alignment)),
        *((VkSystemAllocationScope*)jniLongToPointer(allocationScope))
    );
}
