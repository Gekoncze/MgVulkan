#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkViewport_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewport);
}

void Java_cz_mg_vulkan_VkViewport_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkViewport));
}

jlong Java_cz_mg_vulkan_VkViewport_getXNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_VkViewport_setXNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_VkViewport_getYNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_VkViewport_setYNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}

jlong Java_cz_mg_vulkan_VkViewport_getWidthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->width);
}

void Java_cz_mg_vulkan_VkViewport_setWidthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->width, valuePointer, sizeof(o->width));
}

jlong Java_cz_mg_vulkan_VkViewport_getHeightNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->height);
}

void Java_cz_mg_vulkan_VkViewport_setHeightNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->height, valuePointer, sizeof(o->height));
}

jlong Java_cz_mg_vulkan_VkViewport_getMinDepthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDepth);
}

void Java_cz_mg_vulkan_VkViewport_setMinDepthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDepth, valuePointer, sizeof(o->minDepth));
}

jlong Java_cz_mg_vulkan_VkViewport_getMaxDepthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDepth);
}

void Java_cz_mg_vulkan_VkViewport_setMaxDepthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDepth, valuePointer, sizeof(o->maxDepth));
}


