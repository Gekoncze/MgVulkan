#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdInsertDebugUtilsLabelEXT_call(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pLabelInfo){
    (void)env;
    (void)jc;
    PFN_vkCmdInsertDebugUtilsLabelEXT f = (PFN_vkCmdInsertDebugUtilsLabelEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkDebugUtilsLabelEXT*)jniLongToPointer(pLabelInfo))
    );
}
