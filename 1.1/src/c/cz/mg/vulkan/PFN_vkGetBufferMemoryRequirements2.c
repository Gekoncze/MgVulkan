#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkGetBufferMemoryRequirements2_call(JNIEnv* env, jclass jc, jlong address, jlong device, jlong pInfo, jlong pMemoryRequirements){
    (void)env;
    (void)jc;
    PFN_vkGetBufferMemoryRequirements2 f = (PFN_vkGetBufferMemoryRequirements2)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        ((VkBufferMemoryRequirementsInfo2*)jniLongToPointer(pInfo)),
        ((VkMemoryRequirements2*)jniLongToPointer(pMemoryRequirements))
    );
}
