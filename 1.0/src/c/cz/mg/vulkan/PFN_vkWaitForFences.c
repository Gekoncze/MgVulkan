#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkWaitForFences_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong fenceCount, jlong pFences, jlong waitAll, jlong timeout, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkWaitForFences f = (PFN_vkWaitForFences)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(fenceCount)),
        ((VkFence*)jniLongToPointer(pFences)),
        *((VkBool32*)jniLongToPointer(waitAll)),
        *((uint64_t*)jniLongToPointer(timeout))
    );
}
