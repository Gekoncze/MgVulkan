#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkComponentMapping_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkComponentMapping);
}

jlong Java_cz_mg_vulkan_vk_VkComponentMapping_getR(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&(o->r));
}

void Java_cz_mg_vulkan_vk_VkComponentMapping_setR(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    memcpy(&o->r, jniLongToPointer(valueAddress), sizeof(o->r));
}
jlong Java_cz_mg_vulkan_vk_VkComponentMapping_getG(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&(o->g));
}

void Java_cz_mg_vulkan_vk_VkComponentMapping_setG(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    memcpy(&o->g, jniLongToPointer(valueAddress), sizeof(o->g));
}
jlong Java_cz_mg_vulkan_vk_VkComponentMapping_getB(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&(o->b));
}

void Java_cz_mg_vulkan_vk_VkComponentMapping_setB(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    memcpy(&o->b, jniLongToPointer(valueAddress), sizeof(o->b));
}
jlong Java_cz_mg_vulkan_vk_VkComponentMapping_getA(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&(o->a));
}

void Java_cz_mg_vulkan_vk_VkComponentMapping_setA(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    memcpy(&o->a, jniLongToPointer(valueAddress), sizeof(o->a));
}

