#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkViewport_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewport);
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->x);
}

void Java_cz_mg_vulkan_vk_VkViewport_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->x, valuePointer, sizeof(o->x));
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->y);
}

void Java_cz_mg_vulkan_vk_VkViewport_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->y, valuePointer, sizeof(o->y));
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->width);
}

void Java_cz_mg_vulkan_vk_VkViewport_setWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->width, valuePointer, sizeof(o->width));
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->height);
}

void Java_cz_mg_vulkan_vk_VkViewport_setHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->height, valuePointer, sizeof(o->height));
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getMinDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->minDepth);
}

void Java_cz_mg_vulkan_vk_VkViewport_setMinDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->minDepth, valuePointer, sizeof(o->minDepth));
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getMaxDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&o->maxDepth);
}

void Java_cz_mg_vulkan_vk_VkViewport_setMaxDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->maxDepth, valuePointer, sizeof(o->maxDepth));
}


