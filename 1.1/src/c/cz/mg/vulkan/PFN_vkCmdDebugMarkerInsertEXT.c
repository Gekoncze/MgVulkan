#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

void Java_cz_mg_vulkan_PFNvkCmdDebugMarkerInsertEXT_callNative(JNIEnv* env, jclass jc, jlong address, jlong commandBuffer, jlong pMarkerInfo){
    (void)env;
    (void)jc;
    PFN_vkCmdDebugMarkerInsertEXT f = (PFN_vkCmdDebugMarkerInsertEXT)jniLongToFunctionPointer(address);
    f(
        *((VkCommandBuffer*)jniLongToPointer(commandBuffer)),
        ((VkDebugMarkerMarkerInfoEXT*)jniLongToPointer(pMarkerInfo))
    );
}

