#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkStencilOpState_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkStencilOpState);
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getFailOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->failOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setFailOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->failOp, valuePointer, sizeof(o->failOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getPassOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->passOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setPassOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->passOp, valuePointer, sizeof(o->passOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getDepthFailOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->depthFailOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setDepthFailOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->depthFailOp, valuePointer, sizeof(o->depthFailOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getCompareOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareOp);
}

void Java_cz_mg_vulkan_VkStencilOpState_setCompareOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareOp, valuePointer, sizeof(o->compareOp));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getCompareMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->compareMask);
}

void Java_cz_mg_vulkan_VkStencilOpState_setCompareMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compareMask, valuePointer, sizeof(o->compareMask));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getWriteMask(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->writeMask);
}

void Java_cz_mg_vulkan_VkStencilOpState_setWriteMask(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->writeMask, valuePointer, sizeof(o->writeMask));
}

jlong Java_cz_mg_vulkan_VkStencilOpState_getReference(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    return jniPointerToLong(&o->reference);
}

void Java_cz_mg_vulkan_VkStencilOpState_setReference(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkStencilOpState* o = (VkStencilOpState*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->reference, valuePointer, sizeof(o->reference));
}


