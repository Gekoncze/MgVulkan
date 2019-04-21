#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkXYColorEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkXYColorEXT);
}

jlong Java_cz_mg_vulkan_VkXYColorEXT_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkXYColorEXT* o = (VkXYColorEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_VkXYColorEXT_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkXYColorEXT* o = (VkXYColorEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_VkXYColorEXT_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkXYColorEXT* o = (VkXYColorEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_VkXYColorEXT_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkXYColorEXT* o = (VkXYColorEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}


