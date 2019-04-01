#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkOffset3D_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkOffset3D);
}

jlong Java_cz_mg_vulkan_vk_VkOffset3D_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_vk_VkOffset3D_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_vk_VkOffset3D_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_vk_VkOffset3D_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}

jlong Java_cz_mg_vulkan_vk_VkOffset3D_getZ(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    return jniPointerToLong(&o->z);
}

void Java_cz_mg_vulkan_vk_VkOffset3D_setZ(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkOffset3D* o = (VkOffset3D*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->z, valuePointer, sizeof(o->z));
}


