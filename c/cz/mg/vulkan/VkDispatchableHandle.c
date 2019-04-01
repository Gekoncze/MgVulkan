#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

VK_DEFINE_HANDLE(VkDispatchableHandle)

jlong Java_cz_mg_vulkan_vk_VkDispatchableHandle_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDispatchableHandle);
}

jlong Java_cz_mg_vulkan_vk_VkDispatchableHandle_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    return (jlong) *((VkDispatchableHandle*)jniLongToPointer(address));
}

void Java_cz_mg_vulkan_vk_VkDispatchableHandle_setValue(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    *((VkDispatchableHandle*)jniLongToPointer(address)) = (VkDispatchableHandle) value;
}
