#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRectLayerKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRectLayerKHR);
}

jlong Java_cz_mg_vulkan_VkRectLayerKHR_getOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->offset);
}

void Java_cz_mg_vulkan_VkRectLayerKHR_setOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->offset, valuePointer, sizeof(o->offset));
}

jlong Java_cz_mg_vulkan_VkRectLayerKHR_getExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_VkRectLayerKHR_setExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}

jlong Java_cz_mg_vulkan_VkRectLayerKHR_getLayer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->layer);
}

void Java_cz_mg_vulkan_VkRectLayerKHR_setLayer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRectLayerKHR* o = (VkRectLayerKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layer, valuePointer, sizeof(o->layer));
}


