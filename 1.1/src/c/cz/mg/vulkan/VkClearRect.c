#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkClearRect_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearRect);
}

jlong Java_cz_mg_vulkan_VkClearRect_getRect(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    return jniPointerToLong(&o->rect);
}

void Java_cz_mg_vulkan_VkClearRect_setRect(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->rect, valuePointer, sizeof(o->rect));
}

jlong Java_cz_mg_vulkan_VkClearRect_getBaseArrayLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    return jniPointerToLong(&o->baseArrayLayer);
}

void Java_cz_mg_vulkan_VkClearRect_setBaseArrayLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->baseArrayLayer, valuePointer, sizeof(o->baseArrayLayer));
}

jlong Java_cz_mg_vulkan_VkClearRect_getLayerCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    return jniPointerToLong(&o->layerCount);
}

void Java_cz_mg_vulkan_VkClearRect_setLayerCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearRect* o = (VkClearRect*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layerCount, valuePointer, sizeof(o->layerCount));
}


