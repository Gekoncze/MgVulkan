#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPlanePropertiesKHR);
}

void Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDisplayPlanePropertiesKHR));
}

jlong Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_getCurrentDisplayNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlanePropertiesKHR* o = (VkDisplayPlanePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentDisplay);
}

void Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_setCurrentDisplayNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlanePropertiesKHR* o = (VkDisplayPlanePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentDisplay, valuePointer, sizeof(o->currentDisplay));
}

jlong Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_getCurrentStackIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlanePropertiesKHR* o = (VkDisplayPlanePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->currentStackIndex);
}

void Java_cz_mg_vulkan_VkDisplayPlanePropertiesKHR_setCurrentStackIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlanePropertiesKHR* o = (VkDisplayPlanePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->currentStackIndex, valuePointer, sizeof(o->currentStackIndex));
}


