#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkClearValue_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearValue);
}

jlong Java_cz_mg_vulkan_vk_VkClearValue_getColor(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    return jniPointerToLong(&(o->color));
}

void Java_cz_mg_vulkan_vk_VkClearValue_setColor(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    memcpy(&o->color, jniLongToPointer(valueAddress), sizeof(o->color));
}
jlong Java_cz_mg_vulkan_vk_VkClearValue_getDepthStencil(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depthStencil));
}

void Java_cz_mg_vulkan_vk_VkClearValue_setDepthStencil(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    memcpy(&o->depthStencil, jniLongToPointer(valueAddress), sizeof(o->depthStencil));
}

