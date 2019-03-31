#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkRect2D_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRect2D);
}

jlong Java_cz_mg_vulkan_vk_VkRect2D_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRect2D* o = (VkRect2D*)jniLongToPointer(address);
    return jniPointerToLong(&(o->offset));
}

void Java_cz_mg_vulkan_vk_VkRect2D_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRect2D* o = (VkRect2D*)jniLongToPointer(address);
    memcpy(&o->offset, jniLongToPointer(valueAddress), sizeof(o->offset));
}
jlong Java_cz_mg_vulkan_vk_VkRect2D_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRect2D* o = (VkRect2D*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extent));
}

void Java_cz_mg_vulkan_vk_VkRect2D_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRect2D* o = (VkRect2D*)jniLongToPointer(address);
    memcpy(&o->extent, jniLongToPointer(valueAddress), sizeof(o->extent));
}

