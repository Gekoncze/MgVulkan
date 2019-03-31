#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExtent3D_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExtent3D);
}

jlong Java_cz_mg_vulkan_vk_VkExtent3D_getWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    return jniPointerToLong(&(o->width));
}

void Java_cz_mg_vulkan_vk_VkExtent3D_setWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    memcpy(&o->width, jniLongToPointer(valueAddress), sizeof(o->width));
}
jlong Java_cz_mg_vulkan_vk_VkExtent3D_getHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    return jniPointerToLong(&(o->height));
}

void Java_cz_mg_vulkan_vk_VkExtent3D_setHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    memcpy(&o->height, jniLongToPointer(valueAddress), sizeof(o->height));
}
jlong Java_cz_mg_vulkan_vk_VkExtent3D_getDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    return jniPointerToLong(&(o->depth));
}

void Java_cz_mg_vulkan_vk_VkExtent3D_setDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtent3D* o = (VkExtent3D*)jniLongToPointer(address);
    memcpy(&o->depth, jniLongToPointer(valueAddress), sizeof(o->depth));
}

