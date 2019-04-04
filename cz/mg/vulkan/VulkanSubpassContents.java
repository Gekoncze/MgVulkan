package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassContents.html">khronos documentation</a>
 **/
public class VulkanSubpassContents extends VulkanEnum {
    public static final int INLINE = VkSubpassContents.VK_SUBPASS_CONTENTS_INLINE;
    public static final int SECONDARY_COMMAND_BUFFERS = VkSubpassContents.VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS;

    public VulkanSubpassContents(){
        super(new VkSubpassContents());
    }

    public VulkanSubpassContents(VkSubpassContents vk){
        super(vk);
    }

    @Override
    public VkSubpassContents getVk(){
        return (VkSubpassContents) super.getVk();
    }

    public VulkanSubpassContents(int value){
        super(new VkSubpassContents(value));
    }

    @Override
    public String toString() {
        if(getValue() == INLINE) return "INLINE";
        if(getValue() == SECONDARY_COMMAND_BUFFERS) return "SECONDARY_COMMAND_BUFFERS";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSubpassContents implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassContents> {
        public Array(VkSubpassContents.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassContents.Array(count));
        }

        public Array(int count, VulkanSubpassContents o){
            this(new VkSubpassContents.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassContents.Array getVk(){
            return (VkSubpassContents.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassContents get(int i){
            return new VulkanSubpassContents(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassContents.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassContents.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassContents.Pointer(value));
        }

        @Override
        public VkSubpassContents.Pointer getVk(){
            return (VkSubpassContents.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassContents.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassContents.Pointer> {
            public Array(int count) {
                super(new VkSubpassContents.Pointer.Array(count));
            }

            public Array(VulkanSubpassContents[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassContents.Pointer.Array getVk(){
                return (VkSubpassContents.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassContents.Pointer get(int i){
                return new VulkanSubpassContents.Pointer(getVk().get(i));
            }
        }
    }
}
