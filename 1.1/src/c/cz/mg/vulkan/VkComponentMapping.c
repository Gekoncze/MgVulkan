#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkComponentMapping_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkComponentMapping);
}

jlong Java_cz_mg_vulkan_VkComponentMapping_getRNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&o->r);
}

void Java_cz_mg_vulkan_VkComponentMapping_setRNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->r, valuePointer, sizeof(o->r));
}

jlong Java_cz_mg_vulkan_VkComponentMapping_getGNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&o->g);
}

void Java_cz_mg_vulkan_VkComponentMapping_setGNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->g, valuePointer, sizeof(o->g));
}

jlong Java_cz_mg_vulkan_VkComponentMapping_getBNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&o->b);
}

void Java_cz_mg_vulkan_VkComponentMapping_setBNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->b, valuePointer, sizeof(o->b));
}

jlong Java_cz_mg_vulkan_VkComponentMapping_getANative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    return jniPointerToLong(&o->a);
}

void Java_cz_mg_vulkan_VkComponentMapping_setANative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkComponentMapping* o = (VkComponentMapping*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->a, valuePointer, sizeof(o->a));
}


