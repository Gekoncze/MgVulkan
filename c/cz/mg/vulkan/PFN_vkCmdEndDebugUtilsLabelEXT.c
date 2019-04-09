#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdEndDebugUtilsLabelEXT_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer){
    (void)env;
    (void)jc;
    PFN_vkCmdEndDebugUtilsLabelEXT f = (PFN_vkCmdEndDebugUtilsLabelEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer))
    );
}
