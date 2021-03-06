#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkClearValue_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearValue);
}

void Java_cz_mg_vulkan_VkClearValue_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkClearValue));
}

jlong Java_cz_mg_vulkan_VkClearValue_getColorNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->color);
}

void Java_cz_mg_vulkan_VkClearValue_setColorNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->color, valuePointer, sizeof(o->color));
}

jlong Java_cz_mg_vulkan_VkClearValue_getDepthStencilNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthStencil);
}

void Java_cz_mg_vulkan_VkClearValue_setDepthStencilNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearValue* o = (VkClearValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthStencil, valuePointer, sizeof(o->depthStencil));
}


