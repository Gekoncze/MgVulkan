#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

VK_DEFINE_NON_DISPATCHABLE_HANDLE(VkNonDispatchableHandle)

jlong Java_cz_mg_vulkan_VkNonDispatchableHandle_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkNonDispatchableHandle);
}

jlong Java_cz_mg_vulkan_VkNonDispatchableHandle_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    return (jlong) *((VkNonDispatchableHandle*)jniLongToPointer(address));
}

void Java_cz_mg_vulkan_VkNonDispatchableHandle_setValue(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    *((VkNonDispatchableHandle*)jniLongToPointer(address)) = (VkNonDispatchableHandle) value;
}
