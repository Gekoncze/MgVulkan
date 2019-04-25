#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassBeginInfo);
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getRenderPassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderPass);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setRenderPassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderPass, valuePointer, sizeof(o->renderPass));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getFramebufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->framebuffer);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setFramebufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->framebuffer, valuePointer, sizeof(o->framebuffer));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getRenderAreaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderArea);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setRenderAreaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderArea, valuePointer, sizeof(o->renderArea));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getClearValueCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->clearValueCount);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setClearValueCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->clearValueCount, valuePointer, sizeof(o->clearValueCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassBeginInfo_getPClearValuesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pClearValues);
}

void Java_cz_mg_vulkan_VkRenderPassBeginInfo_setPClearValuesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pClearValues, &valuePointer, sizeof(o->pClearValues));
}


