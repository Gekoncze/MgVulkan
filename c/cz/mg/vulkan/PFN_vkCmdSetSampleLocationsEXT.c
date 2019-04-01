#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_vk_PFNvkCmdSetSampleLocationsEXT_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pSampleLocationsInfo){
    (void)env;
    (void)jc;
    PFN_vkCmdSetSampleLocationsEXT f = (PFN_vkCmdSetSampleLocationsEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkSampleLocationsInfoEXT*)jniLongToPointer(pSampleLocationsInfo))
    );
}
