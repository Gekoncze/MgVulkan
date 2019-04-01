#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSampleLocationEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSampleLocationEXT);
}

jlong Java_cz_mg_vulkan_vk_VkSampleLocationEXT_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationEXT* o = (VkSampleLocationEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_vk_VkSampleLocationEXT_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationEXT* o = (VkSampleLocationEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_vk_VkSampleLocationEXT_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSampleLocationEXT* o = (VkSampleLocationEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_vk_VkSampleLocationEXT_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSampleLocationEXT* o = (VkSampleLocationEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}


