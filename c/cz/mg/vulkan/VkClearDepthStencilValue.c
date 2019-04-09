#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkClearDepthStencilValue_getDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->depth);
}

void Java_cz_mg_vulkan_VkClearDepthStencilValue_setDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depth, valuePointer, sizeof(o->depth));
}

jlong Java_cz_mg_vulkan_VkClearDepthStencilValue_getStencil(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    return jniPointerToLong(&o->stencil);
}

void Java_cz_mg_vulkan_VkClearDepthStencilValue_setStencil(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkClearDepthStencilValue* o = (VkClearDepthStencilValue*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->stencil, valuePointer, sizeof(o->stencil));
}


