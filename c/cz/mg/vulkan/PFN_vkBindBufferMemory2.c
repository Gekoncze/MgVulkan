#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkBindBufferMemory2_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong bindInfoCount, jlong pBindInfos, jlong rval){
    (void)env;
    (void)jc;
    PFN_vkBindBufferMemory2 f = (PFN_vkBindBufferMemory2)jniLongToFunctionPointer(address);
    VkResult* rvalAddress = jniLongToPointer(rval);
    *rvalAddress = f(
        *((VkDevice*)jniLongToPointer(device)),
        *((uint32_t*)jniLongToPointer(bindInfoCount)),
        ((VkBindBufferMemoryInfo*)jniLongToPointer(pBindInfos))
    );
}
