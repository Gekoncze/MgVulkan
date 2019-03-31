#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassBeginInfo);
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getRenderPass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->renderPass));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setRenderPass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->renderPass, jniLongToPointer(valueAddress), sizeof(o->renderPass));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getFramebuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->framebuffer));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setFramebuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->framebuffer, jniLongToPointer(valueAddress), sizeof(o->framebuffer));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getRenderArea(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->renderArea));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setRenderArea(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->renderArea, jniLongToPointer(valueAddress), sizeof(o->renderArea));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getClearValueCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->clearValueCount));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setClearValueCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->clearValueCount, jniLongToPointer(valueAddress), sizeof(o->clearValueCount));
}
jlong Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_getPClearValues(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pClearValues));
}

void Java_cz_mg_vulkan_vk_VkRenderPassBeginInfo_setPClearValues(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassBeginInfo* o = (VkRenderPassBeginInfo*)jniLongToPointer(address);
    memcpy(&o->pClearValues, jniLongToPointer(valueAddress), sizeof(o->pClearValues));
}

