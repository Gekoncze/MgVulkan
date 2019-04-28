#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_PFNvkUnregisterObjectsNVX_callNative(JNIEnv* env, jclass jc, jlong address, jlong device, jlong objectTable, jint objectCount, jlong pObjectEntryTypes, jlong pObjectIndices){
    (void)env;
    (void)jc;
    PFN_vkUnregisterObjectsNVX f = (PFN_vkUnregisterObjectsNVX)jniLongToFunctionPointer(address);
    return f(
        *((VkDevice*)jniLongToPointer(device)),
        *((VkObjectTableNVX*)jniLongToPointer(objectTable)),
        (uint32_t)objectCount,
        ((VkObjectEntryTypeNVX*)jniLongToPointer(pObjectEntryTypes)),
        ((uint32_t*)jniLongToPointer(pObjectIndices))
    );
}

