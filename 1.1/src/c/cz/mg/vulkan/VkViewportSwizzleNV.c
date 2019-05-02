#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewportSwizzleNV);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkViewportSwizzleNV));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getXNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setXNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getYNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setYNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getZNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->z);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setZNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->z, valuePointer, sizeof(o->z));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getWNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->w);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setWNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->w, valuePointer, sizeof(o->w));
}


