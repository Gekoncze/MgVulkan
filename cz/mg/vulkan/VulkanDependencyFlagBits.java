package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDependencyFlagBits.html">khronos documentation</a>
 **/
public class VulkanDependencyFlagBits extends VulkanFlagBits {
    public static final int BY_REGION = VkDependencyFlagBits.VK_DEPENDENCY_BY_REGION_BIT;
    public static final int DEVICE_GROUP = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT;
    public static final int VIEW_LOCAL = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT;
    public static final int VIEW_LOCAL_KHR = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR;
    public static final int DEVICE_GROUP_KHR = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR;

    public VulkanDependencyFlagBits(){
        super(new VkDependencyFlagBits());
    }

    public VulkanDependencyFlagBits(VkDependencyFlagBits vk){
        super(vk);
    }

    @Override
    public VkDependencyFlagBits getVk(){
        return (VkDependencyFlagBits) super.getVk();
    }

    public VulkanDependencyFlagBits(int value){
        super(new VkDependencyFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == BY_REGION) s += "BY_REGION";
        if(getValue() == DEVICE_GROUP) s += "DEVICE_GROUP";
        if(getValue() == VIEW_LOCAL) s += "VIEW_LOCAL";
        if(getValue() == VIEW_LOCAL_KHR) s += "VIEW_LOCAL_KHR";
        if(getValue() == DEVICE_GROUP_KHR) s += "DEVICE_GROUP_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDependencyFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanDependencyFlagBits> {
        public Array(VkDependencyFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDependencyFlagBits.Array(count));
        }

        public Array(int count, VulkanDependencyFlagBits o){
            this(new VkDependencyFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkDependencyFlagBits.Array getVk(){
            return (VkDependencyFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDependencyFlagBits get(int i){
            return new VulkanDependencyFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDependencyFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDependencyFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkDependencyFlagBits.Pointer(value));
        }

        @Override
        public VkDependencyFlagBits.Pointer getVk(){
            return (VkDependencyFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanDependencyFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDependencyFlagBits.Pointer> {
            public Array(int count) {
                super(new VkDependencyFlagBits.Pointer.Array(count));
            }

            public Array(VulkanDependencyFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDependencyFlagBits.Pointer.Array getVk(){
                return (VkDependencyFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDependencyFlagBits.Pointer get(int i){
                return new VulkanDependencyFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
