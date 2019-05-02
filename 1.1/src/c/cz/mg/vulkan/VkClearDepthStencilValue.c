#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkClearDepthStencilValue_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkClearDepthStencilValue);
}

void Java_cz_mg_vulkan_VkClearDepthStencilValue_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkClearDepthStencilValue));
}

jlong Java_cz_mg_vulkan_VkClearDepthStencilValue_getDepthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->depth);
}

void Java_cz_mg_vulkan_VkClearDepthStencilValue_setDepthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depth, valuePointer, sizeof(o->depth));
}

jlong Java_cz_mg_vulkan_VkClearDepthStencilValue_getStencilNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->stencil);
}

void Java_cz_mg_vulkan_VkClearDepthStencilValue_setStencilNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stencil, valuePointer, sizeof(o->stencil));
}


