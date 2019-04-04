package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPeerMemoryFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanPeerMemoryFeatureFlagBits extends VulkanFlagBits {
    public static final int COPY_SRC = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT;
    public static final int COPY_DST = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT;
    public static final int GENERIC_SRC = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT;
    public static final int GENERIC_DST = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT;
    public static final int COPY_SRC_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR;
    public static final int COPY_DST_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR;
    public static final int GENERIC_SRC_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR;
    public static final int GENERIC_DST_KHR = VkPeerMemoryFeatureFlagBits.VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR;

    public VulkanPeerMemoryFeatureFlagBits(){
        super(new VkPeerMemoryFeatureFlagBits());
    }

    public VulkanPeerMemoryFeatureFlagBits(VkPeerMemoryFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkPeerMemoryFeatureFlagBits getVk(){
        return (VkPeerMemoryFeatureFlagBits) super.getVk();
    }

    public VulkanPeerMemoryFeatureFlagBits(int value){
        super(new VkPeerMemoryFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == COPY_SRC) s += "COPY_SRC";
        if(getValue() == COPY_DST) s += "COPY_DST";
        if(getValue() == GENERIC_SRC) s += "GENERIC_SRC";
        if(getValue() == GENERIC_DST) s += "GENERIC_DST";
        if(getValue() == COPY_SRC_KHR) s += "COPY_SRC_KHR";
        if(getValue() == COPY_DST_KHR) s += "COPY_DST_KHR";
        if(getValue() == GENERIC_SRC_KHR) s += "GENERIC_SRC_KHR";
        if(getValue() == GENERIC_DST_KHR) s += "GENERIC_DST_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanPeerMemoryFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanPeerMemoryFeatureFlagBits> {
        public Array(VkPeerMemoryFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPeerMemoryFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanPeerMemoryFeatureFlagBits o){
            this(new VkPeerMemoryFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkPeerMemoryFeatureFlagBits.Array getVk(){
            return (VkPeerMemoryFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPeerMemoryFeatureFlagBits get(int i){
            return new VulkanPeerMemoryFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPeerMemoryFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPeerMemoryFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkPeerMemoryFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkPeerMemoryFeatureFlagBits.Pointer getVk(){
            return (VkPeerMemoryFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanPeerMemoryFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPeerMemoryFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkPeerMemoryFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanPeerMemoryFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPeerMemoryFeatureFlagBits.Pointer.Array getVk(){
                return (VkPeerMemoryFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPeerMemoryFeatureFlagBits.Pointer get(int i){
                return new VulkanPeerMemoryFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
