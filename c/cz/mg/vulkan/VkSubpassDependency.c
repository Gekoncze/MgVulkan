#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassDependency);
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getSrcSubpass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubpass);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setSrcSubpass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubpass, valuePointer, sizeof(o->srcSubpass));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getDstSubpass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubpass);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setDstSubpass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubpass, valuePointer, sizeof(o->dstSubpass));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getSrcStageMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcStageMask);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setSrcStageMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcStageMask, valuePointer, sizeof(o->srcStageMask));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getDstStageMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstStageMask);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setDstStageMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstStageMask, valuePointer, sizeof(o->dstStageMask));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getSrcAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAccessMask);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setSrcAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAccessMask, valuePointer, sizeof(o->srcAccessMask));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getDstAccessMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAccessMask);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setDstAccessMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAccessMask, valuePointer, sizeof(o->dstAccessMask));
}

jlong Java_cz_mg_vulkan_vk_VkSubpassDependency_getDependencyFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyFlags);
}

void Java_cz_mg_vulkan_vk_VkSubpassDependency_setDependencyFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyFlags, valuePointer, sizeof(o->dependencyFlags));
}


