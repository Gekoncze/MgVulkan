#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkDestroyDescriptorUpdateTemplate_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong descriptorUpdateTemplate, jlong pAllocator){
    (void)env;
    (void)jc;
    PFN_vkDestroyDescriptorUpdateTemplate f = (PFN_vkDestroyDescriptorUpdateTemplate)jniLongToFunctionPointer(address);
    f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkDescriptorUpdateTemplate*)jniLongToPointer(descriptorUpdateTemplate)),
        ((VkAllocationCallbacks*)jniLongToPointer(pAllocator))
    );
}

