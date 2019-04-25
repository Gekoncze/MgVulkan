#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSubpassDependency_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkSubpassDependency);
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getSrcSubpassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubpass);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setSrcSubpassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubpass, valuePointer, sizeof(o->srcSubpass));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getDstSubpassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubpass);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setDstSubpassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubpass, valuePointer, sizeof(o->dstSubpass));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getSrcStageMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcStageMask);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setSrcStageMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcStageMask, valuePointer, sizeof(o->srcStageMask));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getDstStageMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstStageMask);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setDstStageMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstStageMask, valuePointer, sizeof(o->dstStageMask));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getSrcAccessMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcAccessMask);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setSrcAccessMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcAccessMask, valuePointer, sizeof(o->srcAccessMask));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getDstAccessMaskNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstAccessMask);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setDstAccessMaskNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstAccessMask, valuePointer, sizeof(o->dstAccessMask));
}

jlong Java_cz_mg_vulkan_VkSubpassDependency_getDependencyFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyFlags);
}

void Java_cz_mg_vulkan_VkSubpassDependency_setDependencyFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkSubpassDependency* o = (VkSubpassDependency*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyFlags, valuePointer, sizeof(o->dependencyFlags));
}


