#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getZ(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->z);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setZ(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->z, valuePointer, sizeof(o->z));
}

jlong Java_cz_mg_vulkan_VkViewportSwizzleNV_getW(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->w);
}

void Java_cz_mg_vulkan_VkViewportSwizzleNV_setW(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewportSwizzleNV* o = (VkViewportSwizzleNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->w, valuePointer, sizeof(o->w));
}


